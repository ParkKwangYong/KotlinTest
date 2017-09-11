package test.kotlintest

/**
 * Created by Android on 2017. 5. 25..
 */
interface MyInterface {


    val property: Int
    val propertyImplement: String
    get() = "foo"

    fun foo(){
        print(property)
    }
    fun bar()
}