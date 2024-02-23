class Student {
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    get getName() {
        return this.name;
    }
    set setName(name) {
        this.name = name;
    }
    speakEnglish() {
        console.log("Say Somethings");
    }
}

class GoodStudent extends Student {
  constructor(id, name, age) {
    super(id, name, age);
    this.level = "Good";
  }
  speakEnglish() {
    console.log("Hello C06");
  }
}

class WeakStudent extends Student {
  constructor(id, name, age) {
    super(id, name, age);
    this.level = "Weak";
  }
  speakEnglish() {
    console.log("Hế lô C06");
  }
}
let ty = new GoodStudent(1, "Tý", 18);
let teo = new WeakStudent(2, "Tèo", 18);
console.log(ty.speakEnglish());//"Hello C06"
console.log(teo.speakEnglish());//"Hế lô C06"