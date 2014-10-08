
public class Test {
	public static void main(String[] args)
    {
         Human aPerson = new Human(160);
         Human dummyPerson = aPerson;
         System.out.println(dummyPerson.getHeight());
         aPerson.growHeight(20);
         System.out.println(dummyPerson.getHeight());
         Human threepersonHuman = dummyPerson;
         System.out.println(threepersonHuman.getHeight());
    }

}
