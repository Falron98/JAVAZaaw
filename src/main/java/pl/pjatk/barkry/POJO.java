package pl.pjatk.barkry;

public class POJO {

    public String message;
    public String message2;

    public POJO(String message, String message2){
        this.message = message;
        this.message2 = message2;
    }

    public String sentence(){
        return this.message + this.message2;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage2() {
        return message2;
    }

    public void soutMe(){
        System.out.println("Hello from pojo method");
    }

}
