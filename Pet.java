package assignment_codefr;

public class Pet {
    private String name;
    private String breed;
    private String gender;
    private int age;
    private boolean isVaccinated;

    public Pet(String name,String breed, String gender, int age, boolean isVaccinated){
        this.name=name;
        this.breed=breed;
        this.gender=gender;
        this.age=age;
        this.isVaccinated=isVaccinated;
    }
//create getter and setter
    //source action for getter and setter
    public void call(String sound){
        for (int i=0;i<3;i++)
        System.out.print(name + sound);
    }

    public void eat(String food){
        System.out.print(name + food);
    }

    public void sleep(){
        System.out.print(name +"is currently sleeping");
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsVaccinated() {
        return this.isVaccinated;
    }

    public boolean getIsVaccinated() {
        return this.isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
    

}
