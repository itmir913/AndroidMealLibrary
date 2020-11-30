# Android Meal Library with Mir(itmir913)

## UPDATE 20150525

## https://github.com/itmir913/wondanghighschool

### 업데이트 지원 중단
나이스에서 오픈 API로 급식 정보를 공개함에 따라, 급식 파싱 라이브러리의 지원을 공식적으로 중단합니다.  
지금까지 제 라이브러리를 사용해주신 모든 분들께 감사의 말씀을 드리며, 아래 사이트로 접속하여 정부에서 공개한 API 정보를 확인하시기 바랍니다.  
[https://open.neis.go.kr/portal/data/dataset/searchDatasetPage.do](https://open.neis.go.kr/portal/data/dataset/searchDatasetPage.do)

### 안내
* 이 프로젝트는 AndroidMealLibrary의 샘플 프로젝트 입니다.
* 자세하게 주석으로 설명되어 있고, 테스트 완료한 프로젝트 입니다.
* 이 프로젝트에 쓰인 MealLibrary.java를 제외하고 '모든 파일'의 저작권은 itmir913에게 있습니다
* 따라서 MealLibrary.java 파일을 제외한 다른 소스를 사용할경우 무조건(강제로) 앱 프로젝트의 오픈소스 라이센스 목록에 제 [블로그 주소](https://itmir.tistory.com), 또는 https://github.com/itmir913/wondanghighschool 주소를 입력해야 합니다.
* 자세한 라이센스 정보는 [이곳](https://github.com/itmir913/wondanghighschool)에서 확인하세요.
* 저는 여러분들께 제 레이아웃까지 마음것 쓰시라고 했지만 출처나 오픈소스 정보 없이 가져가라는 말은 한적이 없습니다. 꼭 출처 표시 지켜주세요 제가 힘들게 만든소스 참고하시라고 오픈해뒀더니 이거 조금만 수정해서 자기가 만든것마냥 올리는 사람 발견하지 않도록..



### 주의사항
* 이 MealLibrary.java는 자유롭게 변형해도 됩니다.
* 그러나 MealLibrary.java가 아닌 이 앱의 모든 코드를 이용할때는 출처와 오픈소스 라이센스를 적어야 합니다.
* 권장 사항이 아닌 강제 사항입니다.
* 급식 자동 업데이트나 위젯같은거 가져가서 자신이 만든 것 처럼 행동하지 마세요
* 그거 진짜 기분 나쁩니다.
* 몇 번 발견된다면 모든 소스를 비공개로 돌리겠습니다.


### 변수 설명

#### CountryCode
* 학교 교육청 코드, nice홈페이지 도메인과 같습니다
* EX) 인천 : ice.go.kr


#### schulCode
* 학교 고유 나이스 코드
* EX) 인천의 학교 코드 검색 : http://hes.ice.go.kr/sts_sci_si00_001.do (E10000xxxx)
* 참조 : 중학교 나이스 코드 검색 : http://me2.do/xAY6Zij1
* 고등학교 나이스 코드 검색 : http://me2.do/G22fDh8l


#### schulCrseScCode
* 학교 분류
* "1" : 병설유치원
* "2" : 초등학교
* "3" : 중학교
* "4" : 고등학교
* 분류번호랑 종류랑 안맞으면 반환이 안됩니다


#### schulKndScCode
* 학교 종류
* "01" : 유치원
* "02" : 초등학교
* "03" : 중학교
* "04" : 고등학교


#### schMmealScCode
* 반환할 식사 값
* 조식 : "1"
* 중식 : "2"
* 석식 : "3"


#### schYmd
* 원하는 날짜의 급식 정보를 얻기 위해 필요합니다
* String 형식 : 년.월.일
* EX) "2014.03.16"
* 새로운 New메소드에서는 schYmd을 지원하지 않고 year, month, day만 지원합니다


#### schYm
* 원하는 달의 급식 정보를 얻기 위해 필요합니다
* String 형식 : 년.월
* EX) "2014.03"
* 새로운 New메소드에서는 schYm 지원하지 않고 year, month, day만 지원합니다


#### year, month, day
* schYmd와 schYm의 정보를 세분화 해서 각각 정보를 넘겨줄때 사용합니다
* EX) year = "2014", month = "03", day = "16"
