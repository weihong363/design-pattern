package com.ironion.template;

/**
 * @author ironion
 * @date 2022/6/25 12:10
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("================");
        game = new Football();
        game.play();
    }
}
