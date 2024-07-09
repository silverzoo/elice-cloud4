![header](https://capsule-render.vercel.app/api?type=venom&color=gradient&height=300&section=header&text=hi,%20I'm%20eunju.&fontColor=fffff&fontSize=120&stroke=b272fa&strokeWidth=0.5)
<div align=center>	

<a href="https://www.notion.so/elice-track/76811849957140188d36ea11193e5f44?pvs=4">
    <img src="https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white"/>
</a>
<a href="https://kdt-gitlab.elice.io/">
    <img src="https://img.shields.io/badge/gitlab-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white"/>
</a>

</div>

## 명령어 정리
### Git
```shell
git log
git init
git checkout -b 새 브랜치이름 (브랜치 생성)
git checkout 기존 브랜치이름 (브랜치 이동)
git checkout -d 기존 브랜치이름 (브랜치 삭제)
git add . (커밋할 파일 전체 올리기 untracked -> tracked)
git rm --cached 파일명 (tracked -> unstracked)
git commit -m "커밋 메시지"
git push --set-upstream origin 브랜치이름 (푸시하는 기본브랜치를 설정하기)
git push -u origin 브랜치이름 (위와 동일. 보통은 main을 쓴다)
git push (최초 푸시 이후 즉, 기본브랜치 설정 이후에는 이렇게 쓰면 된다)
git push <원격저장소> <브랜치이름> (기본설정 외의 다른 브랜치나 저장소에 푸시하고 싶을 때)
git remote add <name> <URL> (원격저장소로 사용하고 싶은 주소와 이름을 설정한다)
git clone <URL>
```

### Linux
```shell
cd (change directory. 홈디렉토리로 이동한다 나의 경우는 /Users/bada)
cd .. (뒤로가기.상위 디렉토리로 이동)
pwd (print working directory. 현재 위치 출력)
ls (list. 해당 디렉토리의 리스트 출력)
touch 파일명 (파일생성. 기존파일이 있다면 그 파일을 수정할 수 있다)
cat 파일명 (기존 파일의 내용을 보여준다 새 파일이라면 작동하지 않는다)
cat > 파일명 (파일생성. cat 이후 타이핑하는 내용이 파일의 내용이 된다 ctrl+d로 저장)
cat 파일명a > 파일명b (b의 내용을 a의 내용으로 복사한다)
cat 파일명a >> 파일명b (b의 기존 내용에 a의 내용을 추가한다)
cat 파일명 파일명 (여러 파일들을 한꺼번에 출력할 수 있다 리다이렉션과 같이 쓸 때도 마찬가지)
rm 파일명 (파일 삭제 여러 파일 가능)
rm -r 디렉토리명 (디렉토리는 -r 옵션과 사용해야 한다)
rm -r ./* (현재 위치한 디렉토리의 하위의 모든 것을 삭제. 강제삭제를 원하면 -rf 옵션을 사용)
```