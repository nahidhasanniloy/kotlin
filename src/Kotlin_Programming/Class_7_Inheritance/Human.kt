package Class_7_Inheritance

 open class Human ( name: String,age:Int,Email:String?=null){


        val namelcl: String = name
        val agelcl: Int = age
        val emaillcl:String? = Email

       fun information() {
            println(" My name is : $namelcl, My age is : $agelcl,Email :$emaillcl ")
        }

}