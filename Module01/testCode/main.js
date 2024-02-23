function Student(id, name, age) {
  this.id = id;
  this.name = name;
  this.age = age;
    this.getId = function () {
      
  };
    this.getId = function (id) {
      return this.id;
  };
    this.sexName = function () {
      
  };
    this.setName = function (name) {
      return this.name
  };
    this.getAge = function () {
      
  };
    this.setId = function (age) {
      return this.age
  };
}
let studentA = new Student(1, "Nguyễn Văn Tèo", 17);
console.log(studentA);