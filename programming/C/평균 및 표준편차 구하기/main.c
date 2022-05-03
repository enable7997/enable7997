#include <stdio.h>
#include <math.h>

int main() {
	double arr[5] = { 0.0 };
	double sum = 0.0, avg = 0.0, s = 0.0, v = 0.0;

	for (int i = 0; i < 5; i++) {
		printf("실수를 입력하시오: ");
		scanf("%lf", &arr[i]);
		sum += arr[i];
	}

	avg = sum / 5.0;
	sum = 0.0;

	for (int i = 0; i < 5; i++) {
		sum += pow((arr[i] - avg), 2.0);
	}

	s = sum / 5.0;
	v = sqrt(s);

	printf("평균:%f\n", avg);
	printf("표준편차:%f", v);

	return 0;
}
