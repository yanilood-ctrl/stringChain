package stringCahin.stringCahin;

public class DStub extends D {
    public  DStub() {super(null);}
	
    @Override
    public String process(String prefix) {
        return prefix + "X"; 
    }
}