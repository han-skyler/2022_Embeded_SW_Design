# 8 Class - 아동 교육용 안드로이드 애플리케이션
프로젝트 기간: 2021.09. ~ 2021.12.

2021년 임베디드 소프트웨어 설계 프로젝트로 개발된 아동 교육용 안드로이드 애플리케이션입니다. 아이와 부모 계정을 분리하여 아이에게는 맞춤형 학습 콘텐츠를 제공하고, 부모에게는 아이의 학습을 관리할 수 있는 기능을 제공합니다.

## 🌟 주요 기능

- **사용자 인증**: Firebase를 이용한 이메일/비밀번호 기반 회원가입 및 로그인
- **사용자 유형 선택**: '아이'와 '부모' 계정을 선택하여 각각 다른 기능 세트 제공
- **학습 콘텐츠**: 국어, 영어, 수학, 미술 등 다양한 과목별 학습 콘텐츠 제공
- **그림판**: 아이들이 자유롭게 그림을 그리고 저장할 수 있는 인터랙티브 기능
- **학습 관리 (To-Do)**: 부모가 아이에게 학습 목표나 과제를 설정해주고, 아이가 이를 확인하고 완료할 수 있는 기능
- **외부 콘텐츠 연동**: 학습 효과를 높이기 위해 유튜브 영상 등 외부 자료 연동

## 🖼️ 주요 화면

애플리케이션의 주요 화면 스크린샷을 여기에 추가하여 프로젝트를 시각적으로 소개할 수 있습니다.

- 로그인 및 회원가입 화면
- 사용자 유형 선택 화면 (아이 / 부모)
- 메인 화면 (과목 선택)
- 각 과목별 학습 화면
- 그림판 화면
- 학습 관리(To-Do) 화면
<p align="center">
  <img src="https://github.com/user-attachments/assets/a75e234c-787b-4a83-9d26-b10c150b07ea" width="150"/>
  <img src="https://github.com/user-attachments/assets/28de0dd8-5a92-4181-97fa-b5dfc6b5991c" width="150"/>
  <img src="https://github.com/user-attachments/assets/ce158211-653a-467c-9b44-56f7125930ca" width="150"/>
  <img src="https://github.com/user-attachments/assets/407bd9ed-254c-44c1-92d0-98510cb6a114" width="150"/>
  <img src="https://github.com/user-attachments/assets/ee0ae6d6-ca4b-4dcc-93c4-da824c3df131" width="150"/>
</p>







## 🛠️ 기술 스택

- **Language**: Java
- **Platform**: Android Native
- **Backend & DB**: Firebase (Authentication, Realtime Database)
- **Build Tool**: Gradle

## ⚙️ 빌드 및 실행 방법

1.  **저장소 복제**
    ```bash
    git clone https://github.com/your-username/2022_Embeded_SW_Design.git
    ```
2.  **Android Studio에서 프로젝트 열기**
    - Android Studio를 실행하고 `Open an Existing Project`를 선택하여 복제된 프로젝트 폴더를 엽니다.
3.  **Gradle 동기화**
    - 프로젝트가 열리면 Android Studio가 자동으로 Gradle 동기화를 진행합니다.
4.  **Firebase 설정**
    - Firebase 콘솔에서 새 프로젝트를 생성합니다.
    - 생성된 프로젝트의 `google-services.json` 파일을 다운로드하여 `app/` 디렉토리 내에 배치해야 합니다.
5.  **앱 실행**
    - `Run 'app'`을 클릭하여 에뮬레이터 또는 실제 기기에서 애플리케이션을 실행합니다.
