function solution(routes) {
    routes.sort((a, b) => a[0] - b[0]); // 진입 지점 기준으로 정렬

    let cameras = 0; // 설치된 카메라 수
    let last_camera = -30001; // 가장 최근에 설치된 카메라 위치

    routes.forEach(route => {
        if (route[0] > last_camera) { // 현재 차량의 진입 지점이 가장 최근에 설치된 카메라보다 뒤에 있을 때
            cameras++; // 새로운 카메라 설치
            last_camera = route[1]; // 해당 차량의 진출 지점에 카메라 설치
        } else if (route[1] < last_camera) { // 현재 차량의 진출 지점이 가장 최근에 설치된 카메라보다 앞에 있을 때
            last_camera = route[1]; // 해당 차량의 진출 지점에 카메라 설치
        }
    });

    return cameras;
}