package OOPs;

public class ImmutableClass {
    public static final class AadhaarCard{
        private final String name;
        private final String motherName;
        private final String fatherName;
        private final String address;
        public AadhaarCard(String name, String motherName, String fatherName, String address){
            this.name = name;
            this.motherName = motherName;
            this.fatherName = fatherName;
            this.address = address;
        }
        public String getMyName(){
            return this.name;
        }
        public String getMyMotherName(){
            return this.motherName;
        }
        public String getMyFatherName(){
            return this.fatherName;
        }
        public String getMyAddress(){
            return this.address;
        }
    }

    public static void main(String[] args) {
        // Let's create your aadhaar card

        // Let's assume that aadhaar details cannot be changed once filled
        // Give your details carefully | It cannot be changed later

        // Provide your name, mother name, father name and your address

        AadhaarCard myAadhaar = new AadhaarCard("Kaif","Sayera","Bhoore","Moradabad, UP");

        System.out.println("AADHAAR DETAILS");
        System.out.println("My name: "+myAadhaar.getMyName());
        System.out.println("My mother name: "+myAadhaar.getMyMotherName());
        System.out.println("My father: "+myAadhaar.getMyFatherName());
        System.out.println("My address+++: "+myAadhaar.getMyAddress());
    }
}
