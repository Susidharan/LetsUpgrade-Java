package com.quizzapplication;

public class game {

    Question[] questions = new Question[3];
    player player = new player();

    public void initGame() {
        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();

        }
        questions[0].question = "Who is the Strongest avenger?";
        questions[0].op1 = "Ironman";
        questions[0].op2 = "Thor";
        questions[0].op3 = "Hulk";
        questions[0].op4 = "Dr Strange";
        questions[0].crctans = 2;

        questions[1].question = "What is the closest planet to the Sun?";
        questions[1].op1 = "Earth";
        questions[1].op2 = "Venus";
        questions[1].op3 = "Mercury";
        questions[1].op4 = "Jupiter";
        questions[1].crctans = 3;

        questions[2].question = "What is the capital of Australia?";
        questions[2].op1 = "Sydney";
        questions[2].op2 = "Melbourne";
        questions[2].op3 = "Perth";
        questions[2].op4 = "Canberra";
        questions[2].crctans = 4;

    }

    public void play() {

        player.getDetails();
        for (int i = 0; i < 3; i++) {
            boolean status = questions[i].askQuestion();
            if (status == true) {
                System.out.println("That's right");
                player.score++;
            } else{
                System.out.println("That's wrong");
            }


        }
        System.out.println(player.name + " your score is " + player.score);
    }
}