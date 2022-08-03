hypothesis(Patient, covid_19) :- symptom(Patient, fever),
                                 symptom(Patient, dry_cough),
                                 symptom(Patient, tiredness),
                                 symptom(Patient, loss_of_taste),
                                 symptom(Patient, loss_of_smell),
                                 symptom(Patient, chest_pain).

hypothesis(Patient, dengue) :- symptom(Patient, high_fever),
                               symptom(Patient, severe_headache),
                               symptom(Patient, muscle_pain),
                               symptom(Patient, joint_pain),
                               symptom(Patient, loss_of_appetite),
                               symptom(Patient, red_rash).

symptom(rafsan, high_fever).
symptom(rafsan, severe_headache).
symptom(rafsan, muscle_pain).
symptom(rafsan, joint_pain).
symptom(rafsan, loss_of_appetite).
symptom(rafsan, red_rash).
