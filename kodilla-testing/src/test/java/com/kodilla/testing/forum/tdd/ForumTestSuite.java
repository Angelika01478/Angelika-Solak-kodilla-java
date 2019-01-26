package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter=0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginig of tests.");
    }


    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute the test number :" + testCounter);
    }

    @After
    public void afterEveryTest(){
        System.out.println("The test number " + testCounter + " have just finished.");
    }

    //czy po dodaniu nowego posta liczba postow wynosi 1
    @Test
    public void testAddPost(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147","Jan Kowalski");
        //when
        forumUser.addPosts("Janek0147", "Hello! This is my first post here");
        //then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }

    //czy po dodaniu nowego komentarza liczba komentarzy pod postem wynosi 1 ?
    @Test
    public void testAddComment(){
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        ForumPost testPost = new ForumPost("Hello! This is my first post here", "Janek0147");
        forumUser.addComment(testPost, "This was very intresing post! I am impressed", "Janek0147");
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    //czy post pobrany z klasy user jest taki sam jak post do niej wstawiany
    @Test
    public void testPost(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kawalski");
        ForumPost thePost= new ForumPost("My first post", "Janek0147");
        //when
        forumUser.addPosts(thePost.getAuthor(), thePost.getPostBody());
        ForumPost result=forumUser.getPost(0);
        //then
        Assert.assertEquals(result, thePost);
    }

    //sprawdzający, czy komentarz pobrany z klasy ForumUser jest taki sam,
    // jak komentarz, który był wstawiany do klasy.
    @Test
    public void testComment(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        ForumPost thePost= new ForumPost("My first post", "Janek0147");
        ForumComment theComment = new ForumComment(thePost, "some comment...", "Janek0147");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
        //when
        ForumComment result = forumUser.getForumComment(0);
        //then
        Assert.assertEquals(theComment,result );
    }

    //sprawdzający, czy próba usunięcia nieistniejącego posta skończy się zwróceniem wyniku false.
    @Test
    public void testRemoveNonExistingPost(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        //when
        boolean result = forumUser.removePost(new ForumPost("non existing post", "unidentified"));
        //then
        Assert.assertFalse(result);
    }

    //sprawdzający, czy próba usunięcia nieistniejącego komentarza skończy się zwróceniem wyniku
    @Test
    public void testRemoveNonExistingComment(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        ForumPost thePost=new ForumPost("some post...", "Janek0147");
        //when
        boolean result = forumUser.removeComment(new ForumComment(thePost, "some body", "Janek0147") );
        //then
        Assert.assertFalse(result);
    }
    //czy udało sie usunac wybrany post z klasy
    @Test
    public void testPostRemoving(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        ForumPost thePost = new ForumPost("some post...","Janek0147");
        forumUser.addPosts(thePost.getAuthor(), thePost.getPostBody());
        //when
        boolean result = forumUser.removePost(thePost);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());
    }

    //weryfikujący, czy udało się usunąć wybrany komentarz z klasy.
    @Test
    public void TestCommentRemoving(){
        //given
        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");
        ForumPost thePost = new ForumPost("some post...","Janek0147");
        ForumComment theComment = new ForumComment(thePost, "my comment", "Janek0147");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
        //when
        boolean result = forumUser.removeComment(theComment);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());

    }

}
