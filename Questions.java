package com.example.vanil_singh.quiz;

public class Questions {

    public String myQuestions[] ={
            "1.Which is the first planet in the solar system?",
            "2.What is the smallest planet in the Solar System",
            "3.Which is the largest planet in the Solar System",
            "4.Which is the hottest planet in Solar System?",
            "5.Which is the fifth planet in the solar system?",
            "6.Which planet is closest to earth?",
            "7.Triton is the largest moon of which planet?",
            "8.Which is the third planet from the sun?",
            "9.Which is the sixth planet in the solar system?",
            "10.What planet is nicknamed the 'Red Planet'?",
            "11.The Gaililean moons orbit which planet?",
            "12.The chemical element uranium was named after what planet?"

    };

    private String myChoices[][] ={

            {"Mercury","Venus","Mars","Saturn"},
            {"Jupiter","Mercury","Earth","Neptune"},
            {"Earth","Jupiter","Pluto","Venus"},
            {"Venus","Saturn","Mars","Earth"},
            {"Jupiter","Pluto","Mercury","Venus"},
            {"Uranus","Venus","Mars","Saturn"},
            {"Saturn","Neptune","Uranus","Earth"},
            {"Venus","Neptune","Earth","Mars"},
            {"Mercury","Venus","Mars","Saturn"},
            {"Earth","Mars","Uranus","Mercury"},
            {"Jupiter","Venus","Mars","Neptune"},
            {"Pluto","Mercury","Saturn","Uranus"}

    };

    private String myCorrectAnswers[] = {"Mercury", "Mercury", "Jupiter", "Venus","Jupiter","Venus", "Neptune", "Earth", "Saturn", "Mars","Jupiter","Uranus"};

    public int getLength(){
        return myQuestions.length;
    }


    public String getQuestion(int a) {
        String question = myQuestions[a];
        return question;
    }


    public String getChoice(int index, int num) {
        String choice0 = myChoices[index][num-1];
        return choice0;
    }


    public String getCorrectAnswer(int a) {
        String answer = myCorrectAnswers[a];
        return answer;
    }
}