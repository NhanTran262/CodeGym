class Student {
  constructor(id, name, age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  get getId() {
    return this.id;
  }

  /**
   * @param {any} id
   */
  set setId(id) {
    this.id = id;
  }

  get getName() {
    return this.name;
  }

  /**
   * @param {any} name
   */
  set setName(name) {
    this.name = name;
  }

  get getAge() {
    return this.age;
  }

  /**
   * @param {any} age
   */
  set setAge(age) {
    this.age = age;
  }
}

let studentB = new Student(2, "Tran Van Ty", 18);
console.log(studentB);
console.log(studentB.name);//"Tran Van Ty" -> not recommend if writing follow OOP
console.log(studentB.getName);//"Tran Van Ty" -> recommend if writing follow OOP