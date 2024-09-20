# Model
## Amount
- [x] 로또 구입 금액을 저장하는 객체
- [ ] 예외 처리 : 잘못된 입력값이 들어왔을 때 IllegalArgumentException을 발생시킨다.
    - [ ] 입력값이 1,000원으로 나누어 떨어지지 않았을 때 IllegalArgumentException를 발생시킨다.
    - [ ] 당첨 번호 숫자가 1 ~ 45 사이의 숫자가 아닌 경우 IllegalArgumentException를 발생시킨다.


## MyLottos
- [x] 로또들을 구입 금액에 맞게 구매하는 객체
- [x] 로또 번호들을 오름차순으로 정렬한다.

## WinningNumbers
- [x] 당첨 번호, 보너스 번호를 저장하는 객체
- [ ] 예외 처리 : 잘못된 입력값이 들어왔을 때 IllegalArgumentException을 발생시킨다.
    - [ ] 보너스 번호가 당첨 번호와 중복될 경우 IllegalArgumentException를 발생시킨다.

## Result
- [ ] 당첨 번호, 보너스 번호와 구매한 로또들을 비교해서 결과를 계산하는 객체
- [x] WinningNumbers와 Lotto를 비교해서 맞은 개수를 계산
- [x] bonusNumber와 Lotto를 비교해서 bonusNumber가 존재하는지 확인
- [x] 맞은 개수와 bonuse가 맞았는지를 통해서 로또가 몇 등인지 확인
- [x] 해당하는 등수의 상금을 더하기
- [x] 수익률을 계산하기


