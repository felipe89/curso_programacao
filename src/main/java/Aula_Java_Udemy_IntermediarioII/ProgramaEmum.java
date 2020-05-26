package Aula_Java_Udemy_IntermediarioII;

import Entidade.Enums.OrderStatusEnums;
import Entidade.Order;

import java.util.Date;

public class ProgramaEmum {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatusEnums.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatusEnums os1 = OrderStatusEnums.DELIVERED;
        OrderStatusEnums os2 = OrderStatusEnums.valueOf("DELIVERED"); /*Informar um valor de status em formato String*/

        System.out.println(os1);
        System.out.println(os2);
    }
}
