//Creating Percentage Mark in PCM
class PercentmarkINpcm{
    public static void main(String[] args){
    // Create a variable for Maths mark
    int math_marks=94;
    // Create a variable for Physics mark
    int physic_marks=95;
    // Create a variable for Chemistry mark
    int chemistry_marks=96;
    //Calulating Percent mark in PCM
    double percent_PCM=((math_marks+physic_marks+chemistry_marks)/3);
    //Printing Percentage of Sam's marks in PCM
    System.out.println("Sam's average mark in PCM is "+percent_PCM);
}}