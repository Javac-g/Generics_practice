public class Four {

    Integer numb;
    String str;

    <T extends Number,V extends String>Four(T numb, V str){

        this.numb = (Integer)numb;
        this.str = str;

    }

}
