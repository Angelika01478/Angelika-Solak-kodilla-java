package stream.beautifier;

public class PoemBeautifier {

    public void beautify (String str, PoemDecorator poemDecorator){
        System.out.println("The old tekst:");
        System.out.println(str);
        System.out.println("The new beautified tekst:");
        System.out.println(poemDecorator.decorate(str));

    }

}
