function solution(matrix1, matrix2) {
    var result = [];


    // 결과 행렬의 크기 결정
    for (var i = 0; i < matrix1.length; i++) {
        let temp=[];
        for (var j = 0; j < matrix2[0].length; j++) {
            let temp2 = 0;
            for (var k = 0; k < matrix1[0].length; k++) {
                temp2 += matrix1[i][k] * matrix2[k][j];
            }
            temp.push(temp2);
        }
        result.push(temp);
    }
    return result;
}