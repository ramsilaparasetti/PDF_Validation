$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/ramsilaparasetti/Downloads/CucumberSeleniumFramework-master/src/main/java/Features/paymentCalculator.feature");
formatter.feature({
  "line": 1,
  "name": "payment calculator",
  "description": "",
  "id": "payment-calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"\u003cminPayment\u003e\" to make",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"\u003carrears\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"\u003cexpPayment\u003e\" now",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "payment-calculator;payment-due-now;",
  "rows": [
    {
      "cells": [
        "minPayment",
        "arrears",
        "expPayment"
      ],
      "line": 10,
      "id": "payment-calculator;payment-due-now;;1"
    },
    {
      "cells": [
        "£10",
        "£40",
        "30"
      ],
      "line": 11,
      "id": "payment-calculator;payment-due-now;;2"
    },
    {
      "cells": [
        "£50",
        "£50",
        "50"
      ],
      "line": 12,
      "id": "payment-calculator;payment-due-now;;3"
    },
    {
      "cells": [
        "£150",
        "£340",
        "190"
      ],
      "line": 13,
      "id": "payment-calculator;payment-due-now;;4"
    },
    {
      "cells": [
        "£160",
        "£25",
        "135"
      ],
      "line": 14,
      "id": "payment-calculator;payment-due-now;;5"
    },
    {
      "cells": [
        "£170",
        "£10",
        "160"
      ],
      "line": 15,
      "id": "payment-calculator;payment-due-now;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"£10\" to make",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"£40\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"30\" now",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£10",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 131486931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£40",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 108907,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 18
    }
  ],
  "location": "paymentCalculator.make_the_payment_now(BigDecimal)"
});
formatter.result({
  "duration": 1943605,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"£50\" to make",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"£50\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"50\" now",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£50",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 186573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£50",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 122665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 18
    }
  ],
  "location": "paymentCalculator.make_the_payment_now(BigDecimal)"
});
formatter.result({
  "duration": 269333,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"£150\" to make",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"£340\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"190\" now",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£150",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 154832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£340",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 79553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "190",
      "offset": 18
    }
  ],
  "location": "paymentCalculator.make_the_payment_now(BigDecimal)"
});
formatter.result({
  "duration": 111686,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"£160\" to make",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"£25\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"135\" now",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£160",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 168820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£25",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 90031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 18
    }
  ],
  "location": "paymentCalculator.make_the_payment_now(BigDecimal)"
});
formatter.result({
  "duration": 133819,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "payment due now",
  "description": "",
  "id": "payment-calculator;payment-due-now;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "customer has a minimum payment \"£170\" to make",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "customer has arrears \"£10\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "make the payment \"160\" now",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£170",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 192558,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£10",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 144526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "160",
      "offset": 18
    }
  ],
  "location": "paymentCalculator.make_the_payment_now(BigDecimal)"
});
formatter.result({
  "duration": 171857,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "payment due later",
  "description": "",
  "id": "payment-calculator;payment-due-later",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "customer has a minimum payment \"£50\" to make",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "customer has arrears \"£100\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "make the payment later",
  "rows": [
    {
      "cells": [
        "balance",
        "expResult"
      ],
      "line": 22
    },
    {
      "cells": [
        "100",
        "100"
      ],
      "line": 23
    },
    {
      "cells": [
        "500",
        "500"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "£50",
      "offset": 32
    }
  ],
  "location": "paymentCalculator.customer_has_minimum_payment(String)"
});
formatter.result({
  "duration": 171630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£100",
      "offset": 22
    }
  ],
  "location": "paymentCalculator.customer_has_arrears(String)"
});
formatter.result({
  "duration": 97751,
  "status": "passed"
});
formatter.match({
  "location": "paymentCalculator.make_the_payment_later(DataTable)"
});
formatter.result({
  "duration": 2509667,
  "status": "passed"
});
});