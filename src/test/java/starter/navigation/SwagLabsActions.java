package starter.navigation;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.fill.SwagLabsPath;

public class SwagLabsActions {

    public static Performable selectProductCategory(String productCategory) {
        return Task.where("{0} select product category",
                actor -> {
                    actor.attemptsTo(
                            Click.on(SwagLabsPath.SELECT_PRODUCT_CATEGORY.of(productCategory))
                    );
        });
    }

    public static Performable enterPersonalFirstName(String personalFirstName) {
        return Task.where("{0} enter user first name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(personalFirstName).into(SwagLabsPath.ENTER_USER_FIRST_NAME)
                    );
        });
    }

    public static Performable enterPersoanLastName(String personalLastName) {
        return Task.where("{0} enter user last name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(personalLastName).into(SwagLabsPath.ENTER_USER_LAST_NAME)
                    );
        });
    }

    public static Performable enterPersonalZipCode(String personalZipCode) {
        return Task.where("{0} enter user zip code",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(personalZipCode).into(SwagLabsPath.ENTER_USER_ZIP_CODE)
                    );
        });
    }

    public static Performable selecttheProduct(String selectProduct) {
        return Task.where("{0} validate the product price" + selectProduct,
                actor -> {
                    actor.attemptsTo(
                            Click.on(SwagLabsPath.SELECT_PRODUCT.of(selectProduct))
                    );
        });
    }

    public static Performable validatetheProductPrice() {
        return Task.where("{0} validate the product price",
                actor -> {
                    actor.attemptsTo(
                            Ensure.that(SwagLabsPath.VALIDATE_PRODUCT_PRICE).isDisplayed()
                    );
        });
    }


//    public static Performable enterUserPassword(String userPassword) {
//        return Task.where("{0} enter user password",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(userPassword).into(OrangeHCMPath.ENTER_USER_PASSWORD)
//                    );
//                });
//    }
//
//    public static Performable selectUserRole(String userRole) {
//        return Task.where("{0} selects user role " + userRole,
//                actor -> {
//                    actor.attemptsTo(
//                            Click.on(OrangeHCMPath.CLICK_USER_ROLE_OPTION),
//                            Click.on(OrangeHCMPath.SELECT_USER_ROLE.of(userRole))
//                    );
//                }
//        );
//    }
//
//    public static Performable enterEmployeeName(String employeeName) {
//        return Task.where("{0} enter employee name",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(employeeName).into(OrangeHCMPath.ENTER_EMPLOYEE_NAME)
//                    );
//                });
//    }
//
//    public static Performable selectStatus(String Status) {
//        return Task.where("{0} select the status" + Status,
//                actor -> {
//                    actor.attemptsTo(
//                            Click.on(OrangeHCMPath.CLICK_STATUS_OPTION),
//                            Click.on(OrangeHCMPath.SELECT_STATUS.of(Status))
//                    );
//                });
//    }
//
//    public static Performable enterUserTypeUserName(String userTypeUserName) {
//        return Task.where("{0} enter user type user name",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(userTypeUserName).into(OrangeHCMPath.ENTER_USER_TYPE_USER_NAME)
//                    );
//                });
//    }
//
//    public static Performable enterUserTypePassword(String userTypePassword) {
//        return Task.where("{0} enter user type password",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(userTypePassword).into(OrangeHCMPath.ENTER_USER_TYPE_PASSWORD)
//                    );
//                });
//    }
//
//    public static Performable enterUserTypeConfirmPassword(String userTypeConfirmPassword) {
//        return Task.where("{0} enter user type confirm password",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(userTypeConfirmPassword).into(OrangeHCMPath.ENTER_USER_TYPE_CONFIRM_PASSWORD)
//                    );
//                });
//    }
//
//    public static Performable enterSystemUserName(String systemUserName) {
//        return Task.where("{0} enter system user name",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(systemUserName).into(OrangeHCMPath.ENTER_SYSTEM_USER_NAME)
//                    );
//                });
//    }
//
//    public static Performable selectSystemUserRole(String systemUserRole) {
//        return Task.where("{0} select the system user role" + systemUserRole,
//                actor -> {
//                    actor.attemptsTo(
//                            Click.on(OrangeHCMPath.CLICK_SYSTEM_USER_ROLE_OPTION),
//                            Click.on(OrangeHCMPath.SELECT_SYSTEM_USER_ROLE.of(systemUserRole))
//                    );
//                });
//
//    }
//
//    public static Performable enterSystemUserEmployeeName(String systemUserEmployeeName) {
//        return Task.where("{0} enter system user employee name",
//                actor -> {
//                    actor.attemptsTo(
//                            Enter.theValue(systemUserEmployeeName).into(OrangeHCMPath.ENTER_SYSTEM_USER_EMPLOYEE_NAME)
//                    );
//                });
//    }
//
//    public static Performable selectSystemUserStatus(String systemUserStatus) {
//        return Task.where("{0} select the system user status" + systemUserStatus,
//                actor -> {
//                    actor.attemptsTo(
//                            Click.on(OrangeHCMPath.CLICK_SYSTEM_USER_STATUS_OPTION),
//                            Click.on(OrangeHCMPath.SELECT_SYSTEM_USER_STATUS.of(systemUserStatus))
//                    );
//                });
//    }
}

