package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        Library library = new Library("Library number 1");
        Book book1 = new Book("Wołyń zdradzony", "Zychowicz Piotr", LocalDateTime.of(2019,6,1,0,0));
        Book book2 = new Book("Wira z Powstania. Wspomnienia", "Szlachetko George", LocalDateTime.of(2018,4,1,0,0));
        Book book3 = new Book("Mengele. Polowanie na Anioła Śmierci z Auschwitz", "Posner Gerald", LocalDateTime.of(2019,2,1,0,0));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library libraryShallowCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy= library.deepCopy();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        library.getBooks().remove(book1);


        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, libraryShallowCopy.getBooks().size());
        Assert.assertEquals(3, libraryDeepCopy.getBooks().size());
        Assert.assertEquals(library.getBooks(), libraryShallowCopy.getBooks());
        Assert.assertNotEquals(libraryDeepCopy.getBooks(), library.getBooks());

    }

}
