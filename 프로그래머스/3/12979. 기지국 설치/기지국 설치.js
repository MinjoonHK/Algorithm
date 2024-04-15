function solution(n, stations, w) {
  let answer = 0;
  const distance = [];

  for (let i = 1; i < stations.length; i++) {
    distance.push(stations[i] - w - 1 - (stations[i - 1] + w));
  }
  distance.push(stations[0] - w - 1);
  distance.push(n - (stations[stations.length - 1] + w));

  for (const d of distance) {
    if (d <= 0) continue;
    else answer += Math.ceil(d / (2 * w + 1));
  }

  return answer;
}