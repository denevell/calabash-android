Then /^I rotate the device to landscape$/ do
  performAction('set_activity_orientation', 'landscape')
  performAction('wait', 4)
end

Then /^I rotate the device to portrait$/ do
  performAction('set_activity_orientation', 'portrait')
  performAction('wait', 4)
end
