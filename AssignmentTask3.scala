
object AssignmentTask3 {

  sealed trait Employee
  case class FullTimeEmployee(name: String, salary: Double) extends Employee
  case class PartTimeEmployee(name: String, salary: Double) extends Employee
  case class ContractType(name: String, salary: Double, months: Int) extends Employee
  case class Freelancers(name: String, salary: Double, hours: Int) extends Employee

  def calculateSalary(employee: Employee): Double = {
    employee match {
      case FullTimeEmployee(_, salary) => salary*12
      case PartTimeEmployee(_, salary) => salary*12
      case ContractType(_, salary, months)  => salary*months
      case Freelancers(_, salary, hours)=> salary*hours
    }
  }
  def main(args: Array[String]): Unit = {
    val employees = List(
      FullTimeEmployee("Akash", 23000), //per month. After procedure it will give 12 month salary
      PartTimeEmployee("Aman", 34098.56), //per month. After procedure it will give 12 month salary
      ContractType("Peyush", 20000, 10), //per month. After procedure it will give 10 month salary
      Freelancers("Anupam", 350, 6) //per month. After procedure it will give 6 hours' earning
    )

    employees.foreach{ employee =>
      val salary = calculateSalary(employee)
      println(salary)
    }
  }
}
