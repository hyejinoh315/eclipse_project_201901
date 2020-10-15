# Eclipse Project
2019년도 개발 공부를 시작하며 진행한 미니 프로젝트입니다.

### 프로젝트 제목
MY CAFE TYCOON

### 개발언어 / 환경
JAVA

### 프로그램 개요
'MY CAFE TYCOON'은 레트로 감성을 담은 이클립스 콘솔 게임입니다.
트럭카페(푸드트럭)에서 장사를 시작하여 30일간 카페를 운영하며 매장을 점점 넓히고, 평판을 쌓아보세요!

### 주요 기능

#### 1. 게임 설명 확인

#### 2. 평판에 따른 매장 업그레이드 기능
매장이 업그레이드 될 수록 판매하는 제품의 카테고리가 늘어나고, 손님의 종류가 다양해 집니다.

#### 3. 현재 상태 확인

#### 4. 매장 오픈
매장을 오픈하면 날씨가 랜덤으로 결정되고 그에 따라 손님의 수가 결정됩니다.
화창 - 30% - 4명
미세먼지 - 30% - 2명
구름 - 20% - 5명
비 - 15% - 3명
태풍 - 5% - 운영할 수 없고 체력이 약간 회복됩니다.
날씨가 운영에 적합할수록 손님의 수는 많아지고, 적합하지 않을 수록 손님수가 적어집니다.

#### 5. 휴식
운영을 하다 보면 주인공의 체력이 점점 닳게 되는데 미니게임을 통해서 체력 회복을 할 수 있습니다.
체력이 50이하가 되면 휴식을 취할 수 있는데, 오락실과 집을 들르는 것에 따라 회복량이 달라집니다.
체력이 0 이하가 되면 응급실 이벤트를 보게 됩니다.

#### 6. BGM ON/OFF 기능
BGM을 켜고 끌 수 있습니다. ON 할때마다 노래가 처음부터 플레이 됩니다.


### 사용한 스레드
#### 1. 로딩바 스레드
메인화면에서 보여집니다. 로딩바 스레드가 시작되면 종료될때까지 다른 스레드들은 잠시 대기하게 됩니다.

#### 2. 음향 스레드
- 기본 BGM
- 손님 방문시 종소리
- 커피머신 작동소리
- 믹서기 소리
- 빵 꺼내는 소리
- 요리하는 소리
- 구급차 소리
- 엔딩 BGM 및 효과음

#### 3. 이미지 스레드
제조를 선택하면 보여집니다.

#### 4. 손님 스레드
주문 대기시간이 길어지면 화를 내고 돌아가기도 합니다.

#### 5. 슬립 스레드
게임 호흡 조절을 위해 중간중간 사용하였습니다.

#### 6. 타이머 스레드

### Comment
설계단계에서 시간을 얼마나 들여 구상을 하는가에 대한 중요함을 느낄 수 있었던 프로젝트였습니다. 어설픈 설계 덕분에 스레드를 사용하여 작품의 마무리를 짓는것이 정말 힘들었습니다.


```
 .___  ___. ____    ____      ______      ___       _______  _______ 
 |   \/   | \   \  /   /     /      |    /   \     |   ____||   ____|
 |  \  /  |  \   \/   /     |  ,----'   /  ^  \    |  |__   |  |__   
 |  |\/|  |   \_    _/      |  |       /  /_\  \   |   __|  |   __|  
 |  |  |  |     |  |        |  `----. /  _____  \  |  |     |  |____  
 |__|  |__|     |__|         \______|/__/     \__\ |__|     |_______|

  .___________.____    ____   ______   ______     ______   .__   __. 
  |           |\   \  /   /  /      | /  __  \   /  __  \  |  \ |  |  
  `---|  |----` \   \/   /  |  ,----'|  |  |  | |  |  |  | |   \|  |   
      |  |       \_    _/   |  |     |  |  |  | |  |  |  | |  . `  |      
      |  |         |  |     |  `----.|  `--'  | |  `--'  | |  |\   |    
      |__|         |__|      \______| \______/   \______/  |__| \__| 
```
