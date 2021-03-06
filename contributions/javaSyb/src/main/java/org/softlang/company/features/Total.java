package org.softlang.company.features;

import org.softlang.company.model.*;

import static javaf.syb.Query.*;
import javaf.prelude.*;

public class Total {

    public static Double total(Company c) {
        return everything(orDefault(getSalary(), 0.0), add, 0.0).apply(c);
    }

    public static Function<Employee,Double> getSalary() {
        return new Function<Employee, Double>() {
            public Double apply(Employee x) {
                return x.getSalary();
            }
        };
    }

    public static BinaryOperator<Double> add =
        new BinaryOperator<Double>() {
            public Double apply(Double x1, Double x2) {
                return x1+x2;
            }
        };
}