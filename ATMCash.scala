import scala.io.StdIn.readLine
object ATMCash {

//  def calcualateCombinations(dict: Map[Int, Int], amount: Int, initialComb: Map[Int, Int], listt: List[Nothing]): List[List[Map[Int, Int]]] = {
//    if(amount<0){
//      print("No negative amount allowed")
//    }else if(amount==0){
//      print("0 combinations for 0 amount")
//
//    }else if(amount%5!=0){
//      print("No 2 and 1 Rs Notes")
//    }else{
//      dict.keys.foldLeft()
//    }
//    listt
//  }

  def main(args: Array[String]): Unit = {
    print("Enter number of 2000 notes: ")
    val x = readLine().toInt
    print("Enter number of 500 notes: ")
    val y = readLine().toInt
    print("Enter number of 100 notes: ")
    val z = readLine().toInt
    print("Enter number of 50 notes: ")
    val xx = readLine().toInt
    print("Enter number of 20 notes: ")
    val yy = readLine().toInt
    print("Enter number of 10 notes: ")
    val zz = readLine().toInt
    print("Enter number of 5 notes: ")
    val xyz = readLine().toInt

    print("Enter amount for combinations: ")
    val amount = readLine().toInt
    var count = 0

//    if(amount%5!=0){
//      println("Combinations not possible. 0 combinations as their is no 2 and 1 rs notes")
//    }else{
//      for(i<-0 to x){
//        for(j<- 0 to y){
//          for(k<- 0 to z){
//            for(ii<- 0 to xx){
//              for(jj <- 0 to yy){
//                for(kk<- 0 to zz){
//                  for(ijk<- 0 to xyz){
//                    val combAmount = i*2000 + j*500 + k*100 + ii*50 + jj*20 + kk*10 + ijk*5
//                    if(combAmount==amount){
//                      println(s"2000 notes:$i, 500 notes:$j, 100 notes:$k, 50 notes:$ii, 20:$jj, 10 notes:$kk, 5 notes:$ijk")
//                      count += 1
//                    }
//                  }
//                }
//              }
//            }
//          }
//        }
//      }
//    }
    var dict = Map(2000->x, 500->y, 100->z, 50->xx, 20->yy, 10->zz, 5->xyz)
    var initialComb = Map(2000->0, 500->0, 100->0, 50->0, 20->0, 10->0, 5->0)

//    calcualateCombinations(dict, amount, initialComb, List())

  }

}
