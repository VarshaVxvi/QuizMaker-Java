class Questions{
    String questiontext;
    String[] options;
    int  correctans;
    public Questions(String questiontext,String[] options,int correctans){
        this.questiontext = questiontext;
        this.options=options;
        this.correctans=correctans;
    }
    public void displayQuestion(){
        System.out.print(questiontext);
        System.out.println("\n");
        for(int i=0;i<options.length;i++){
            System.out.print(options[i]);
            System.out.println("\n");
        }
    }
    public boolean isCorrect(int input){
        return input== correctans;

    }
}