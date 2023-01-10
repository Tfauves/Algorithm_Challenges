package com.company.leetcode;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String test = "G()(al)";
        interpret(test);
    }

    public static String interpret(String command) {
        StringBuilder commandReturn = new StringBuilder();
        System.out.println(command);

        for (int i = 0; i < command.length(); i++) {
           switch (command.charAt(i)) {
               case 'G': commandReturn.append("G");
               break;
               case ('('): if (command.charAt(i + 1) == ')' ) {
                   commandReturn.append("o");
               } else commandReturn.append("al");
               break;
           }
        }


        System.out.println(commandReturn);
        return commandReturn.toString();
    }
}
