package ua.intita.qa;

public class Customer {
    private int id;
    private String surname;
    private  String  name;
    private String otchestvo;
    private String adress;
    private  int NumCreditCard;
    private int NumBank;

    public Customer(
            int id,
            String surname,
            String  name,
            String otchestvo,
            String adress,
            int NumCreditCard,
            int NumBank
    )
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.adress = adress;
        this.NumCreditCard = NumCreditCard;
        this.NumBank = NumBank;

    }
    public Customer(String surname,int NumCreditCard) {
        this.surname = surname;
        this.NumCreditCard = NumCreditCard;
        System.out.println("Привет из первого конструктора:");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumCreditCard() {
        return NumCreditCard;
    }

    public void setNumCreditCard(int numCreditCard) {
        NumCreditCard = numCreditCard;
    }

    public int getNumBank() {
        return NumBank;
    }

    public void setNumBank(int numBank) {
        NumBank = numBank;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo= '" + otchestvo + '\'' +
                ", adress='" + adress + '\'' +
                ", NumCreditCard=" + NumCreditCard +
                ", NumBank=" + NumBank +
                '}';
    }

    public  void Interval(int NumCreditCard, Customer[] people) {
        int startInterval = 0;
        int endInterval = 0;
        System.out.println("Enter startInterval :");
        System.out.println("Enter endInterval :");
        if (startInterval >= endInterval) {
            System.out.println("Error, enter correct number");
        }
        for (Customer customer : people) {
            if (customer.NumCreditCard >= startInterval && customer.NumCreditCard <= endInterval) {
                System.out.println(customer.toString());
            }
        }

    }



}

