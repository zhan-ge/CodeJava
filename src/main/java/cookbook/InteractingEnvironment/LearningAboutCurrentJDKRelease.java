package cookbook.InteractingEnvironment;
// Created by ZG on 15/9/5.
// 

public class LearningAboutCurrentJDKRelease {
    public static void main(String[] args) {
        try{
            Class.forName("javax.swing.JButton");
        }catch (ClassNotFoundException e){
            String failure = "Sorry, but this version of MyApp needs.";
            System.out.println(failure);
        }
    }
}
