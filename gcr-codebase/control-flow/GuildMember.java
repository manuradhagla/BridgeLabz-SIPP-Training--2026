class GuildMember {
    public static void main(String[] args) {\
        String name = "Ravi";
        int age = 25;
        int rank = 3;
        double salary = 50000.0;       
        float membershipFee = 1500.50f;

        double annualBonus = salary * 0.12;
        int bonusInt = (int) annualBonus;  

        System.out.println("Welcome to Coding Guild");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: INR " + salary);
        System.out.println("Membership Fee: INR " + membershipFee);
        System.out.println("Annual Bonus: INR " + bonusInt);
        System.out.println("   Best wishes for your journey!  ");
    }
}
