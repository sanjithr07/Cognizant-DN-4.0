-- Insert into Customers
INSERT INTO Customers VALUES (1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE);
INSERT INTO Customers VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);
INSERT INTO Customers VALUES (3, 'Alice Wayne', TO_DATE('1992-02-25', 'YYYY-MM-DD'), 2000, SYSDATE);
INSERT INTO Customers VALUES (4, 'Tom Hardy', TO_DATE('1988-11-30', 'YYYY-MM-DD'), 1200, SYSDATE);
INSERT INTO Customers VALUES (5, 'Emma Frost', TO_DATE('1995-08-10', 'YYYY-MM-DD'), 1700, SYSDATE);

-- Insert into Accounts
INSERT INTO Accounts VALUES (1, 1, 'Savings', 1000, SYSDATE);
INSERT INTO Accounts VALUES (2, 2, 'Checking', 1500, SYSDATE);
INSERT INTO Accounts VALUES (3, 3, 'Savings', 2000, SYSDATE);
INSERT INTO Accounts VALUES (4, 4, 'Current', 1200, SYSDATE);
INSERT INTO Accounts VALUES (5, 5, 'Checking', 1700, SYSDATE);

-- Insert into Transactions
INSERT INTO Transactions VALUES (1, 1, SYSDATE, 200, 'Deposit');
INSERT INTO Transactions VALUES (2, 2, SYSDATE, 300, 'Withdrawal');
INSERT INTO Transactions VALUES (3, 3, SYSDATE, 500, 'Deposit');
INSERT INTO Transactions VALUES (4, 4, SYSDATE, 100, 'Withdrawal');
INSERT INTO Transactions VALUES (5, 5, SYSDATE, 300, 'Deposit');

-- Insert into Loans
INSERT INTO Loans VALUES (1, 1, 5000, 5, SYSDATE, ADD_MONTHS(SYSDATE, 60));
INSERT INTO Loans VALUES (2, 2, 8000, 6, SYSDATE, ADD_MONTHS(SYSDATE, 48));
INSERT INTO Loans VALUES (3, 3, 3000, 4.5, SYSDATE, ADD_MONTHS(SYSDATE, 24));
INSERT INTO Loans VALUES (4, 4, 6000, 5.5, SYSDATE, ADD_MONTHS(SYSDATE, 36));
INSERT INTO Loans VALUES (5, 5, 10000, 7, SYSDATE, ADD_MONTHS(SYSDATE, 72));

-- Insert into Employees
INSERT INTO Employees VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (3, 'Charlie Kim', 'Analyst', 55000, 'Finance', TO_DATE('2018-09-05', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (4, 'David Lee', 'HR Exec', 50000, 'HR', TO_DATE('2019-01-10', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (5, 'Eva Green', 'Tester', 48000, 'QA', TO_DATE('2020-07-15', 'YYYY-MM-DD'));