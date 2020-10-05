package com.company.lesson8.pizzeria.people;

import com.company.lesson8.pizzeria.things.WorkType;

public class ServiceFactory {

      public ServiceStaff serviceStaff(WorkType type){
          ServiceStaff serviceStaff=null;
          switch (type){
              case COOK :
                  serviceStaff=new Cock();
                  break;
              case SERVE:
              case GET_ORDER:
              case CLOSE_ORDER:
              serviceStaff=new Waiter();
              break;
              case MAKE_DRINK:
                  serviceStaff=new Barman();
                  break;
          }
          return serviceStaff;
      }
}
