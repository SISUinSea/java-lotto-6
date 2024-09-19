# Model
## Amount
- [ ] 로또 구입 금액을 저장하는 객체
- [ ] 예외 처리 : 잘못된 입력값이 들어왔을 때 IllegalArgumentException을 발생시킨다.
    - [ ] 입력값이 1,000원으로 나누어 떨어지지 않았을 때 IllegalArgumentException를 발생시킨다.

## MyLottos
- [ ] 로또들을 구입 금액에 맞게 구매하는 객체

## WinningNumbers
- [ ] 당첨 번호, 보너스 번호를 저장하는 객체
- [ ] 예외 처리 : 잘못된 입력값이 들어왔을 때 IllegalArgumentException을 발생시킨다.
    - [ ] 당첨 번호 숫자가 6개가 아닌 경우 IllegalArgumentException을 발생시킨다.
    - [ ] 당첨 번호 숫자가 1 ~ 45 사이의 숫자가 아닌 경우 IllegalArgumentException를 발생시킨다.
    - [ ] 당첨 번호 숫자중 중복되는 번호가 있을 경우 IllegalArgumentException을 발생시킨다.
    - [ ] 보너스 번호가 당첨 번호와 중복될 경우 IllegalArgumentException를 발생시킨다.

## Result
- [ ] 당첨 번호, 보너스 번호와 구매한 로또들을 비교해서 결과를 계산하는 객체

