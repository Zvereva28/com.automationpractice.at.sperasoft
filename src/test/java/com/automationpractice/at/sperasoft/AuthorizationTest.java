package com.automationpractice.at.sperasoft;


import com.automationpractice.at.sperasoft.base.BeforeAndAfter;
import com.automationpractice.at.sperasoft.pages.AuthenticationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class AuthorizationTest extends BeforeAndAfter {
   //  String ts = String.valueOf(System.currentTimeMillis())+"@rt.ut";



    static Stream<Arguments> stringAndIntProvider() {
        return Stream.of(Arguments.of(((System.currentTimeMillis())+"zvereva@ele.na"), "Name","LastName","123456789","sjhdgf","dhfgfg",12,"25","32659874"),
                Arguments.of(((System.currentTimeMillis())+"zvereva@ele.na"), "1233","LastName222","1234","sjhd555gf","dhfgfg",15,"20","3265956874"));
    }



        @DisplayName("Регистрация ")
        @ParameterizedTest
        @MethodSource("stringAndIntProvider")
        @Test
        void checkSingInValidLogin(String email,
                                   String firstName,
                                   String lastName,
                                   String password,
                                   String address,
                                   String city,
                                   int indexOfState,
                                   String postCode,
                                   String phone) throws InterruptedException {
//            String login = "hao17583@bcaoo.com";
//            String password = "hao17583";
            new AuthenticationPage(driver)
                    .openUrl().
                    createAnAccountPositive(email).
                    creationAccountNegativeTry(
                            firstName,lastName,password,address,city,indexOfState,postCode,phone);
            sleep(5000);








        }

    }

//
//    @DisplayName("Регистрация ")
//    @ParameterizedTest
//    @MethodSource("stringAndIntProvider")
//    @Test
//    void checkSingInValidLogin(String email) throws InterruptedException {
////            String login = "hao17583@bcaoo.com";
////            String password = "hao17583";
//        new AuthenticationPage(driver)
//                .openUrl().
//                createAnAccountPositive((System.currentTimeMillis())+"zvereva@ele.na").
//                creationAccountNegativeTry(
//                        "Name","LastName","123456789","sjhdgf","dhfgfg",12,"25","32659874");
//        sleep(5000);
//
//
//
//
//
//
//
//
//    }
//
//}
