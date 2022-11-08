public class Vokabel{
    private String questionWord, translation;
    private int counter;

    public Vokabel(String sQuestionWord, String sTranslation) {
        this.questionWord = sQuestionWord;
        this.translation = sTranslation;
        this.counter = 0;
    }

    public Vokabel(String sQuestionWord, String sTranslation, int iCounter) {
        this.questionWord = sQuestionWord;
        this.translation = sTranslation;
        this.counter = iCounter;
    }

    public String getQuestionWord() {
        return questionWord;
    }

    public String getTranslation() {
        return translation;
    }

    public int getCounter(){
        return counter;
    }

    public void setQuestionWord(String questionWord) {
        this.questionWord = questionWord;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }
}