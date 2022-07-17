@smoke
  Feature:F2
    Scenario:
      Given  Click Search Icon
      When Send Search Word "addition"
      Then Make List of Lessons
      Then click "2"lesson
      Then Click WorkSheet
      Then go back
      Then count number of Question in WorkSheet

