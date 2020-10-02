//--------------------------- calendar ---------------------------------
document.addEventListener("DOMContentLoaded", function () {
  buildCalendar();
});

var today = new Date(); // @param 전역 변수, 오늘 날짜 / 내 컴퓨터 로컬을 기준으로 today에 Date 객체를 넣어줌
var date = new Date(); // @param 전역 변수, today의 Date를 세어주는 역할

function prevCalendar() {
  this.today = new Date(
    today.getFullYear(),
    today.getMonth() - 1,
    today.getDate()
  );
  buildCalendar(); // @param 전월 캘린더 출력 요청
}

function nextCalendar() {
  this.today = new Date(
    today.getFullYear(),
    today.getMonth() + 1,
    today.getDate()
  );
  buildCalendar(); // @param 명월 캘린더 출력 요청
}

function buildCalendar() {
  let doMonth = new Date(today.getFullYear(), today.getMonth(), 1);
  let lastDate = new Date(today.getFullYear(), today.getMonth() + 1, 0);

  let tbCalendar = document.querySelector(".scriptCalendar > tbody");

  document.getElementById("calYear").innerText = today.getFullYear(); // @param YYYY월
  document.getElementById("calMonth").innerText = autoLeftPad(
    today.getMonth() + 1,
    2
  ); // @param MM월

  while (tbCalendar.rows.length > 0) {
    tbCalendar.deleteRow(tbCalendar.rows.length - 1);
  }

  let row = tbCalendar.insertRow();

  let dom = 1;

  let daysLength =
    Math.ceil((doMonth.getDay() + lastDate.getDate()) / 7) * 7 -
    doMonth.getDay();

  for (let day = 1 - doMonth.getDay(); daysLength >= day; day++) {
    let column = row.insertCell();

    if (Math.sign(day) == 1 && lastDate.getDate() >= day) {
      column.innerText = autoLeftPad(day, 2);

      if (dom % 7 == 1) {
        column.style.color = "#FF8400";
      }

      if (dom % 7 == 0) {
        column.style.color = "blue";
        row = tbCalendar.insertRow(); // @param 토요일이 지나면 다시 가로 행을 한줄 추가한다.
      }
    } else {
      let exceptDay = new Date(doMonth.getFullYear(), doMonth.getMonth(), day);
      column.innerText = autoLeftPad(exceptDay.getDate(), 2);
      column.style.color = "#A9A9A9";
    }

    if (today.getFullYear() == date.getFullYear()) {
      if (today.getMonth() == date.getMonth()) {
        if (date.getDate() > day && Math.sign(day) == 1) {
          column.style.backgroundColor = "#eee";
        } else if (date.getDate() < day && lastDate.getDate() >= day) {
          column.style.backgroundColor = "#FFFFFF";
          column.style.cursor = "pointer";
          column.onclick = function () {
            calendarChoiceDay(this);
          };
        } else if (date.getDate() == day) {
          column.style.backgroundColor = "#fff3e7";
          column.style.cursor = "pointer";
          column.onclick = function () {
            calendarChoiceDay(this);
          };
        }
      } else if (today.getMonth() < date.getMonth()) {
        if (Math.sign(day) == 1 && day <= lastDate.getDate()) {
          column.style.backgroundColor = "#eee";
        }
      } else {
        if (Math.sign(day) == 1 && day <= lastDate.getDate()) {
          column.style.backgroundColor = "#FFFFFF";
          column.style.cursor = "pointer";
          column.onclick = function () {
            calendarChoiceDay(this);
          };
        }
      }
    } else if (today.getFullYear() < date.getFullYear()) {
      if (Math.sign(day) == 1 && day <= lastDate.getDate()) {
        column.style.backgroundColor = "#eee";
      }
    } else {
      if (Math.sign(day) == 1 && day <= lastDate.getDate()) {
        column.style.backgroundColor = "#FFFFFF";
        column.style.cursor = "pointer";
        column.onclick = function () {
          calendarChoiceDay(this);
        };
      }
    }

    dom++;
  }
}

function calendarChoiceDay(column) {
  if (document.getElementsByClassName("choiceDay")[0]) {
    document.getElementsByClassName("choiceDay")[0].style.backgroundColor =
      "#FFFFFF";
    document
      .getElementsByClassName("choiceDay")[0]
      .classList.remove("choiceDay");
  }

  column.style.backgroundColor = "#9ea2c7";

  column.classList.add("choiceDay");
}

function autoLeftPad(num, digit) {
  if (String(num).length < digit) {
    num = new Array(digit - String(num).length + 1).join("0") + num;
  }
  return num;
}
// ------------------------- popup ----------------------------
$().ready(function () {
  // 탭메뉴
  $(".roadMapNav li").click(function () {
    var idx = $(this).index();
    $(".roadMapNav li").removeClass("active");
    $(this).addClass("active");
    $(".roadMapCont > div").hide();
    $(".roadMapCont > div").eq(idx).show();
  });
});
