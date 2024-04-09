class Student {
  private String name;
  private int age;
  private String email;

  void print() {

    System.out.println(name + " " + age + " " + email);
  }
  void SetEmail(String email) throws Exception {

    if (email.equals("")) {
      throw new Exception("Email important");
    } else {
      this.email = email;
    }
  }
  void SetName(String name) throws Exception {
    if (name.length() > 10) {
      throw new Exception("Name cannot more 10 simvol");
    } else {
      this.name = name;
    }
  }
  void SetAge(int age) throws Exception {
    if (age > 100 || age < 10) {
      throw new Exception("Age cannot more 100 and less than 10");
    } else {
      this.age = age;
    }

  }
}
