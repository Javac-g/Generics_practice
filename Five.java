public class Five {
    String msg;
    Integer numb;

    <T extends Number> Five(T numb){

        this.numb = (Integer)numb;

    }

    <T extends Number,V extends String>Five(T numb,V msg ){

        this.numb = (Integer)numb;
        this.msg = msg;
    }

}
