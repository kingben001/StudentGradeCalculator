public class Student {

    private String name;
    private double concept1;
    private double programming1;
    private double concept2;
    private double programming2;
    private double conceptfinal;
    private double programmingfinal;


    public Student(){
        name = " ";
        concept1 = 0;
        programming1 = 0;
        concept2 = 0;
        programming2 = 0;
        conceptfinal = 0;
        programmingfinal = 0;

    }
    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public double getConcept1() {
        return concept1;
    }

    public void setConcept1(double newconcept1) {
       if (newconcept1 > 0 && newconcept1 < 100){
            concept1 = newconcept1;
       }
    }

    public double getProgramming1() {
        return programming1;
    }

    public void setProgramming1(double newprogramming1) {
        if (newprogramming1 > 0 && newprogramming1 < 100){
            programming1 = newprogramming1;
        }
    }

    public double getConcept2() {
        return concept2;
    }

    public void setConcept2(double newconcept2) {
        if (newconcept2 > 0 && newconcept2 < 100){
            concept2 = newconcept2;
        }
    }

    public double getProgramming2() {
        return programming2;
    }

    public void setProgramming2(double newprogramming2) {
        if (newprogramming2 > 0 && newprogramming2 < 100){
            programming2 = newprogramming2;
        }
    }

    public double getConceptfinal() {
        return conceptfinal;
    }

    public void setConceptfinal(double newconceptfinal) {
        if (newconceptfinal > 0 && newconceptfinal < 100){
            conceptfinal = newconceptfinal;
        }
    }

    public double getProgrammingfinal() {
        return programmingfinal;
    }

    public void setProgrammingfinal(double newprogrammingfinal) {
        if (newprogrammingfinal > 0 && newprogrammingfinal < 100){
            programmingfinal = newprogrammingfinal;
        }
    }
}
