package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;

    ArrayList<ForumPost> posts = new ArrayList<>();
    LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName){
        this.name=name;
        this.realName=realName;
    }

    public void addPosts(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost forumPost, String commentBody, String author){
        ForumComment theComment= new ForumComment(forumPost, commentBody, author);
        comments.add(theComment);
    }

    public int getPostQuantity(){

        return posts.size();
    }

    public int getCommentsQuantity(){
        return comments.size();
    }

    //pobranie postu z kolekcji posts
    public ForumPost getPost(int postNumber){
        ForumPost thePost = null;
        if(postNumber>=0 && postNumber< posts.size()){
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    //pobranie komentarza z kolekcji comments
    public ForumComment getForumComment(int commentNumber){
        ForumComment theComment = null;
        if(commentNumber>=0 && commentNumber< comments.size()){
            theComment=comments.get(commentNumber);
        }
       return theComment;
    }
    //true gdy usuniecie komentarza
    public boolean removeComment(ForumComment theComment){
        boolean result = false;
        if(comments.contains(theComment)){
            comments.remove(theComment);
            result= true;
        }
        return result;
    }

    //true gdy usunieto post
    public boolean removePost (ForumPost thePost){
        boolean result = false;
        if(posts.contains(thePost)){
            posts.remove(thePost);
            result=true;
        }
        return result;
    }

    public String getName(){
        return name;
    }

    public String getRealName(){
        return realName;
    }



}
