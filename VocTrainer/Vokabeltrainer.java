public class Vokabeltrainer{
    List<Vokabel> unknown;
    List<Vokabel> known;
    List<Vokabel> perfect;

    int lenght;

    public Vokabeltrainer() {
        this.unknown = new List<>();
        this.known = new List<>();
        this.perfect = new List<>();

        this.lenght = 0;

        preset();

        if(!this.unknown.isEmpty()) {
            this.unknown.toFirst();

        } else if (!this.known.isEmpty()) {
            this.known.toFirst();

        } else if (!this.perfect.isEmpty()) {
            this.perfect.toFirst();
        }
    }
    public void preset() {
        this.unknown.append(new Vokabel("y", "z"));
        this.lenght ++;

        this.unknown.append(new Vokabel("yy", "zz"));
        this.lenght ++;

        this.unknown.append(new Vokabel("yyy", "zzz"));
        this.lenght ++;
    }

    public void neueVokabelHinzufuegen(String questionWord, String translation) {
        unknown.append(new Vokabel(questionWord, translation));
        this.lenght ++;
    }

    /* // bsp für vokabelSearch()
    this.unknown.toFirst();
    for (int i = lenght; i < vokabelSearch("y")// position von y)
    {
        next();
    }
    this.unknown.remove();
    lenght --;

    */

    public int vokabelSearch(String questionWord) {
        int position = 0;

        if(!this.unknown.isEmpty()) {
            this.unknown.toFirst();
            while(this.unknown.hasAccess()) {
                if(this.unknown.getContent().getQuestionWord().equals(questionWord)){
                    position ++;
                    return position;
                }
                position ++;
                this.unknown.next();
            }
        }
        if (!this.known.isEmpty()) {
            this.known.toFirst();
            while(this.known.hasAccess()) {
                if(this.known.getContent().getQuestionWord().equals(questionWord)){
                    position ++;
                    return position;
                }
                position ++;
                this.known.next();
            }
        }
        if (!this.perfect.isEmpty()) {
            this.perfect.toFirst();
            while(this.perfect.hasAccess()) {
                if(this.perfect.getContent().getQuestionWord().equals(questionWord)){
                    position ++;
                    return position;
                }
                position ++;
                this.perfect.next();
            }
        }

        return position;
    }
    
    public String vokabelAbfragen() {
        if(!this.unknown.isEmpty()) {
            return this.unknown.getContent().getTranslation();

        } else if (!this.known.isEmpty()) {
            return this.known.getContent().getTranslation();

        } else if (!this.perfect.isEmpty()) {
            return this.perfect.getContent().getTranslation();

        } else { 
            return "";
        }
    }
    
    public String printAll() {
        String all = "";

        if (!this.unknown.isEmpty()) {
            all = all + "UNKNOWN:" + "\n";
            this.unknown.toFirst();
            while(this.unknown.hasAccess()){
                all = all + this.unknown.getContent().getQuestionWord() + " : " + this.unknown.getContent().getTranslation() + "\n";
                this.unknown.next();
            }
            all = all + "\n";
        }
        if (!this.known.isEmpty()) {
            all = all + "KNOWN:" + "\n";
            this.known.toFirst();
            while(this.known.hasAccess()){
                all = all + this.known.getContent().getQuestionWord() + " : " + this.known.getContent().getTranslation() + "\n";
                this.known.next();
            }
            all = all + "\n";
        }
        if (!this.perfect.isEmpty()) {
            all = all + "PERFECT:" + "\n";
            this.perfect.toFirst();
            while(this.perfect.hasAccess()){
                all = all + this.perfect.getContent().getQuestionWord() + " : " + this.perfect.getContent().getTranslation() + "\n";
                this.perfect.next();
            }
        }
        return all;
    }
}
