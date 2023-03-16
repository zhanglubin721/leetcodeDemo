数组倒着+1算进位，如果出现参数是99的情况，最后就新建一个数组,
newResult[0] = 1;
System.arraycopy(digits, 0, newResult, 1, digits.length);
