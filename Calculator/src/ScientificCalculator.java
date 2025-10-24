class ScientificCalculator extends AdvancedCalculator {

    // num1을 num2번 곱한 결과를 result에 저장합니다.
    public int pow() {
        int base = num1;
        int exp = num2;

        if (exp < 0) {
            System.out.println("음수 지수는 지원하지 않습니다.");
            result = Integer.MAX_VALUE;
            return result;
        }

        if (exp == 0) {
            result = 1;
            return result;
        }

        int temp = 1;
        for (int i = 0; i < exp; i++) {
            setNumbers(temp, base);
            temp = multiply();
        }

        result = temp;
        // 출력 시 원래 값이 보이도록 복구
        num1 = base;
        num2 = exp;
        return result;
    }
}
