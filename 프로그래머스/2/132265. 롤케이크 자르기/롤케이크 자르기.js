function solution(topping) {
    let leftToppings = new Map();
    let rightToppings = new Map();

    // 처음에 모든 토핑을 rightToppings에 추가
    topping.forEach(t => {
        rightToppings.set(t, (rightToppings.get(t) || 0) + 1);
    });

    let fairCutCount = 0;

    for (let i = 0; i < topping.length - 1; i++) {
        // i 번째 토핑을 rightToppings에서 leftToppings로 이동
        let t = topping[i];
        leftToppings.set(t, (leftToppings.get(t) || 0) + 1);
        rightToppings.set(t, rightToppings.get(t) - 1);

        if (rightToppings.get(t) === 0) {
            rightToppings.delete(t);
        }

        // 좌우 조각의 토핑 종류 수가 같으면 공평하게 나누어진다.
        if (leftToppings.size === rightToppings.size) {
            fairCutCount++;
        }
    }

    return fairCutCount;
}
