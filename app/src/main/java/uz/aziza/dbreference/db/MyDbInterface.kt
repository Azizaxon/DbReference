package uz.aziza.dbreference.db

import uz.aziza.dbreference.models.Buyurtma
import uz.aziza.dbreference.models.Sotuvchi
import uz.aziza.dbreference.models.Xaridor

interface MyDbInterface {

    fun addSalesman(sotuvchi: Sotuvchi)
    fun addCustomer(xaridor: Xaridor)
    fun addOrder(buyurtma: Buyurtma)

    fun getAllSalesman():List<Sotuvchi>
    fun getAllCustomer():List<Xaridor>
    fun getAllOrders():List<Buyurtma>

    fun getSalesmanById(id:Int):Sotuvchi
    fun getCustomerById(id:Int):Xaridor
}